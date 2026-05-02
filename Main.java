public class Main {

    public static void main(String[] args) {

        StudentRegistration reg = new StudentRegistration();

        // Uji coba 1 = sukses
        try {
            reg.register("putri celandy", 19);
        } catch (InvalidNameException e) {
            System.out.println("Error Nama: " + e.getMessage());
        } catch (InvalidAgeException e) {
            System.out.println("Error Umur: " + e.getMessage());
        }

        // Uji coba 2 = nama kosong
        try {
            reg.register("", 20);
        } catch (InvalidNameException e) {
            System.out.println("Error Nama: " + e.getMessage());
        } catch (InvalidAgeException e) {
            System.out.println("Error Umur: " + e.getMessage());
        }

        // Uji coba 3 = umur dibawah 16
        try {
            reg.register("Budi", 15);
        } catch (InvalidNameException e) {
            System.out.println("Error Nama: " + e.getMessage());
        } catch (InvalidAgeException e) {
            System.out.println("Error Umur: " + e.getMessage());
        }
    }
}