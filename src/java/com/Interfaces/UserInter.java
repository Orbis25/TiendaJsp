
package com.Interfaces;

import com.Bean.User;


public interface UserInter {
    
    public void registrar(User user);
    public boolean login(User user);
    public int emailActivacion(User user);
    
}
