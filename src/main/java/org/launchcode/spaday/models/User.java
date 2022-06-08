package org.launchcode.spaday.models;

import javax.validation.constraints.Email;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Size;

public class User {

    @NotBlank(message = "Username is required")
    @Size(min=5, max=15, message = "Username must be between 5 and 15 characters")
    private String userame;

    @Email(regexp=".+@.+\\..+||null")
    private String email;

    @NotBlank(message = "Password is required")
    @Size(min=6, message = "Password must be at least six characters")
    private String password;

    @NotBlank(message = "Please re-enter your password")
    private String verifyPassword;

    public String getUserame() {
        return userame;
    }

    public void setUserame(String userame) {
        this.userame = userame;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getVerifyPassword() {
        return verifyPassword;
    }

    public void setVerifyPassword(String verifyPassword) {
        this.verifyPassword = verifyPassword;
    }
}
