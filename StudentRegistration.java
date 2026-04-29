public class StudentRegistration {

    public void register(String nama, int umur)
            throws InvalidNameException, InvalidAgeException {

        // Validasi nama kosong
        if (nama.isEmpty()) {
            // Throw exception karena nama tidak boleh kosong (data wajib diisi)
            throw new InvalidNameException("Nama tidak boleh kosong!");
        }

        // Validasi umur tidak logis
        if (umur < 16 || umur > 60) {
            // Throw exception karena umur di luar batas syarat UNPRI
            throw new InvalidAgeException("Umur tidak memenuhi syarat Universitas!");
        }

        System.out.println("Pendaftaran Mahasiswa " + nama + " Berhasil!");
    }
}