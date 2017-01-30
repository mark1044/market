package com.will.intent.data.sevices;
import com.will.intent.data.mapping.MarketUser;
import com.will.intent.data.repo.MarketUserRepository;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by marksmelendez on 1/15/17.
 */
public class MarketUserService implements UserDetailsService {

    private final MarketUserRepository marketUserRepository;

    public MarketUserService(MarketUserRepository marketUserRepository) {
        this.marketUserRepository = marketUserRepository;
    }

    @Override
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {

        MarketUser user = marketUserRepository.findUserByName(username);
        System.out.println(user.getEmail());
        User marketUser = null;
        if(user != null){


            List<GrantedAuthority> authorities =
                    new ArrayList<GrantedAuthority>();
            authorities.add(new SimpleGrantedAuthority("ROLE_USER"));

            marketUser = new User(
                    user.getUserName(),
                    user.getPassword(),
                    authorities);


        }

        return marketUser;

    }

}
