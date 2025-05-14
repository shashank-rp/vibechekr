package com.rith.vibechekr.common.model;

public class ReviewDto {

    private Long rvId;
    private String rating;
    private String comment;
    private UserDataDto tenantId;
    private UpsertInfoDto upsertInfo;

    public ReviewDto() {
    }

    public ReviewDto rvId(Long rvId) {
        this.rvId = rvId;
        return this;
    }

    public Long getRvId() {
        return this.rvId;
    }

    public void setRvId(Long rvId) {
        this.rvId = rvId;
    }

    public ReviewDto rating(String rating) {
        this.rating = rating;
        return this;
    }

    public String getRating() {
        return this.rating;
    }

    public void setRating(String rating) {
        this.rating = rating;
    }

    public ReviewDto comment(String comment) {
        this.comment = comment;
        return this;
    }

    public String getComment() {
        return this.comment;
    }

    public void setComment(String comment) {
        this.comment = comment;
    }

    public ReviewDto tenantId(UserDataDto tenantId) {
        this.tenantId = tenantId;
        return this;
    }

    public UserDataDto getTenantId() {
        return this.tenantId;
    }

    public void setTenantId(UserDataDto tenantId) {
        this.tenantId = tenantId;
    }

    public ReviewDto upsertInfo(UpsertInfoDto upsertInfo) {
        this.upsertInfo = upsertInfo;
        return this;
    }

    public UpsertInfoDto getUpsertInfo() {
        return this.upsertInfo;
    }

    public void setUpsertInfo(UpsertInfoDto upsertInfo) {
        this.upsertInfo = upsertInfo;
    }




    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ReviewDto {\n");
        sb.append("    rvId: ").append(this.toIndentedString(this.rvId)).append("\n");
        sb.append("    rating: ").append(this.toIndentedString(this.rating)).append("\n");
        sb.append("    comment: ").append(this.toIndentedString(this.comment)).append("\n");
        sb.append("    tenantId: ").append(this.toIndentedString(this.tenantId)).append("\n");
        sb.append("    upsertInfo: ").append(this.toIndentedString(this.upsertInfo)).append("\n");
        sb.append("}");
        return sb.toString();
    }

    private String toIndentedString(Object o) {
        return o == null ? "null" : o.toString().replace("\n", "\n    ");
    }
}
