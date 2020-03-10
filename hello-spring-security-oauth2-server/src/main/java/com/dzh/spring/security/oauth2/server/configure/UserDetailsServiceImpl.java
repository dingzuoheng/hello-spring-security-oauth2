package com.dzh.spring.security.oauth2.server.configure;

import com.dzh.spring.security.oauth2.server.domain.TbPermission;
import com.dzh.spring.security.oauth2.server.domain.TbUser;
import com.dzh.spring.security.oauth2.server.service.TbPermissionService;
import com.dzh.spring.security.oauth2.server.service.TbUserService;
import org.assertj.core.util.Lists;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @Description TODO
 * @ClassName UserDetailServiceImpl
 * @Author DingZuoHeng
 * @Date 2020/3/10
 * @Version 1.0
 **/
@Service
public class UserDetailsServiceImpl implements UserDetailsService {

    @Autowired
    private TbUserService tbUserService;
    @Autowired
    private TbPermissionService tbPermissionService;


    @Override
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
        TbUser user = tbUserService.getByUsername(username);
        List<GrantedAuthority> grantedAuthorities = Lists.newArrayList();
        if (user != null) {
            List<TbPermission> tbPermissions = tbPermissionService.selectByUserId(user.getId());
            tbPermissions.forEach(tbPermission -> {
                GrantedAuthority grantedAuthority = new SimpleGrantedAuthority(tbPermission.getEnname());
                grantedAuthorities.add(grantedAuthority);
            });
            return new User(user.getUsername(), user.getPassword(), grantedAuthorities);
        }

        return null;
    }
}
