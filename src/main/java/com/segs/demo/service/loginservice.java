package com.segs.demo.service;

import java.util.Arrays;
import java.util.List;

import org.springframework.stereotype.Service;

import com.segs.demo.model.Users;


@Service
public class loginservice {
    public Users fetchUserDetails(int userId) {
        // Replace with real DB/service call
        if (userId == 7) {
            return new Users("Bhavya", "bhavya@demo.com", "FACULTY", 7);
        } else if (userId == 2025) {
            return new Users("Admin", "admin@demo.com", "REGISTRAR", 2025);
        } else {
            return null;
        }
    }
    public boolean isAllowedUser(String userCategory, int userId) {
        List<Integer> allowedIds = Arrays.asList(3365, 1126, 6326, 2025, 3809, 2484, 11045);
        return userCategory.equals("REGISTRAR") || userCategory.equals("FACULTY") || allowedIds.contains(userId);
    }
    public boolean isPermittedMachine(int userId, String ip) {
        // Example: allow all for testing
        return true;
    }

    
}
