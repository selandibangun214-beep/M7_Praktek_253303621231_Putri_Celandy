public class StudentRegistration {

    public void register(String nama, int umur) 
            throws InvalidNameException, InvalidAgeException {

        if (nama == null || nama.isEmpty()) {
            // Nama kosong menyebabkan error
            throw new InvalidNameException("Nama tidak boleh kosong!");
        }

        if (umur < 16 || umur > 60) {
            // Umur tidak sesuai syarat universitas
            throw new InvalidAgeException("Umur tidak memenuhi syarat Universitas!");
        }

        System.out.println("Pendaftaran Mahasiswa " + nama + " Berhasil!");
    }
}