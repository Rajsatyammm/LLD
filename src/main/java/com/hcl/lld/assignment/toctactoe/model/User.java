package com.hcl.lld.assignment.toctactoe.model;

public class User {
    private String name;
    private String email;

    private User() {

    }

    public static Builder builder() {
        return new Builder();
    }

    public static class Builder {
        private User user;

        private Builder() {
            user = new User();
        }

        public Builder withName(String name) {
            user.name = name;
            return this;
        }

        public Builder withEmail(String email) {
            user.email = email;
            return this;
        }

        public User build() {
            return user;
        }
    }
}
