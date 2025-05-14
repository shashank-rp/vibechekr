package com.rith.vibechekr.common.model;

import java.util.UUID;

public class UpsertInfoDto {
    private UUID createdBy;
    private String createdAt;
    private UUID modifiedBy;
    private String modifiedAt;

    public UpsertInfoDto() {
    }

    public UpsertInfoDto createdBy(UUID createdBy) {
        this.createdBy = createdBy;
        return this;
    }

    public UUID getCreatedBy() {
        return this.createdBy;
    }

    public void setCreatedBy(UUID createdBy) {
        this.createdBy = createdBy;
    }

    public UpsertInfoDto createdAt(String createdAt) {
        this.createdAt = createdAt;
        return this;
    }

    public String getCreatedAt() {
        return this.createdAt;
    }

    public void setCreatedAt(String createdAt) {
        this.createdAt = createdAt;
    }

    public UpsertInfoDto modifiedBy(UUID modifiedBy) {
        this.modifiedBy = modifiedBy;
        return this;
    }

    public UUID getModifiedBy() {
        return this.modifiedBy;
    }

    public void setModifiedBy(UUID modifiedBy) {
        this.modifiedBy = modifiedBy;
    }

    public UpsertInfoDto modifiedAt(String modifiedAt) {
        this.modifiedAt = modifiedAt;
        return this;
    }

    public String getModifiedAt() {
        return this.modifiedAt;
    }

    public void setModifiedAt(String modifiedAt) {
        this.modifiedAt = modifiedAt;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class UpsertInfoDto {\n");
        sb.append("    createdBy: ").append(this.toIndentedString(this.createdBy)).append("\n");
        sb.append("    createdAt: ").append(this.toIndentedString(this.createdAt)).append("\n");
        sb.append("    modifiedBy: ").append(this.toIndentedString(this.modifiedBy)).append("\n");
        sb.append("    modifiedAt: ").append(this.toIndentedString(this.modifiedAt)).append("\n");
        sb.append("}");
        return sb.toString();
    }

    private String toIndentedString(Object o) {
        return o == null ? "null" : o.toString().replace("\n", "\n    ");
    }
}

