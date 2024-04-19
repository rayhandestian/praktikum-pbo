package com.manajemen.penerbangan;

import java.util.ArrayList;

public class UjiPenerbangan {
    public static void main(String[] args) {
        ManajemenPenerbangan manajer = new ManajemenPenerbangan();
        manajer.tambahPenerbangan(new Penerbangan("P001", "Jakarta", "Surabaya", "08:00", "berangkat"));
        manajer.tambahPenerbangan(new Penerbangan("P002", "Surabaya", "Jakarta", "09:00", "delay"));

        System.out.println("Total penerbangan: " + ManajemenPenerbangan.getTotalPenerbangan());

        Penerbangan p = manajer.cariPenerbangan("P001");

        if (p != null) {
            System.out.println("Penerbangan ditemukan: " + p.getKodePenerbangan());
        } else {
            System.out.println("Penerbangan tidak ditemukan");
        }

        ArrayList<Penerbangan> delayed = manajer.filterPenerbangan("delay");
        System.out.println("Penerbangan yang delay:");
        for (Penerbangan d : delayed) {
            System.out.println(d.getKodePenerbangan() + " " + d.getKotaAsal() + " " + d.getKotaTujuan() + " " + d.getWaktuBerangkat());
        }
    }
}
