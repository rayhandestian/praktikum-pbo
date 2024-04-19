package com.manajemen.penerbangan;

public class Penerbangan {
    private String kodePenerbangan;
    private String kotaAsal;
    private String kotaTujuan;
    private String waktuBerangkat;
    private String status;

    public Penerbangan(String kodePenerbangan, String kotaAsal, String kotaTujuan, String waktuBerangkat, String status) {
        this.kodePenerbangan = kodePenerbangan;
        this.kotaAsal = kotaAsal;
        this.kotaTujuan = kotaTujuan;
        this.waktuBerangkat = waktuBerangkat;
        this.status = status;
    }

    // Getter and Setter
    public String getKodePenerbangan() {
        return kodePenerbangan;
    }

    public void setKodePenerbangan(String kodePenerbangan) {
        this.kodePenerbangan = kodePenerbangan;
    }

    public String getKotaAsal() {
        return kotaAsal;
    }

    public void setKotaAsal(String kotaAsal) {
        this.kotaAsal = kotaAsal;
    }

    public String getKotaTujuan() {
        return kotaTujuan;
    }

    public void setKotaTujuan(String kotaTujuan) {
        this.kotaTujuan = kotaTujuan;
    }

    public String getWaktuBerangkat() {
        return waktuBerangkat;
    }

    public void setWaktuBerangkat(String waktuBerangkat) {
        this.waktuBerangkat = waktuBerangkat;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }
}
