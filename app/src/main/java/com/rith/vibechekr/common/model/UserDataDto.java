package com.rith.vibechekr.common.model;

import java.util.UUID;

public class UserDataDto {
    private UUID userId;
    private String firstName;
    private String lastName;
    private String userName;

    public UserDataDto() {
    }

    public UserDataDto userId(UUID userId) {
        this.userId = userId;
        return this;
    }

    public UUID getUserId() {
        return this.userId;
    }

    public void setUserId(UUID userId) {
        this.userId = userId;
    }

    public UserDataDto firstName(String firstName) {
        this.firstName = firstName;
        return this;
    }

    public String getFirstName() {
        return this.firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public UserDataDto lastName(String lastName) {
        this.lastName = lastName;
        return this;
    }

    public String getLastName() {
        return this.lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public UserDataDto userName(String userName) {
        this.userName = userName;
        return this;
    }

    public String getUserName() {
        return this.userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }


    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class UserDataDto {\n");
        sb.append("    userId: ").append(this.toIndentedString(this.userId)).append("\n");
        sb.append("    firstName: ").append(this.toIndentedString(this.firstName)).append("\n");
        sb.append("    lastName: ").append(this.toIndentedString(this.lastName)).append("\n");
        sb.append("    userName: ").append(this.toIndentedString(this.userName)).append("\n");
        sb.append("}");
        return sb.toString();
    }

    private String toIndentedString(Object o) {
        return o == null ? "null" : o.toString().replace("\n", "\n    ");
    }
}

