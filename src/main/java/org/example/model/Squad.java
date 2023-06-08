package org.example.model;

public class Squad {
    private  String squad;
    private  String cause;
    private  Integer size;
    private Boolean deleted;

    public void setSquad(String squad) {
        this.squad = squad;
    }
    public void setCause(String cause) {
        this.cause = cause;
    }
    public void setSize(Integer size) {
        this.size = size;
    }
    public void setDeleted(Boolean deleted) { this.deleted = deleted; }

    public String getSquad() {
        return squad;
    }
    public String getCause() {
        return cause;
    }
    public Integer getSize() {
        return size;
    }

    public Boolean getDeleted() { return deleted; }

    public Squad(String squad, String cause, Integer size, Boolean deleted) {
        this.squad = squad;
        this.cause = cause;
        this.size = size;
        this.deleted = deleted;
    }

    @Override
    public String toString() {
        return "Squad{" +
                "squad='" + squad + '\'' +
                ", cause='" + cause + '\'' +
                ", size=" + size +
                ", deleted=" + deleted +
                '}';
    }
}
