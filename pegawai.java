package com.company;

class pegawai {
    private String nip,nama,divisi;

    public pegawai(String nip, String nama, String divisi) {

        this.nip = nip;
        this.nama = nama;
        this.divisi = divisi;
    }

    public String getNip() {
        return nip;
    }

        public String getNama() {
            return nama;
        }

                public String getDivisi() {
                    return divisi;
                }

    @Override
    
    public String toString() {
        return "pegawai{" +
                "nip='" + nip + '\'' +
                ", nama='" + nama + '\'' +
                ", divisi='" + divisi + '\'' +
                '}';
    }
}
