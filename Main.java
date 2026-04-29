public class Main {
    public static void main(String[] args) {

        StudentRegistration sr = new StudentRegistration();

        // Uji coba 1: sukses
        try {
            sr.register("Putri Celandy", 20);

            // Uji coba 2: nama kosong
            sr.register("", 22);

            // Uji coba 3: umur tidak valid
            sr.register("Putri Celandy", 15);

        } catch (InvalidNameException e) {
            System.out.println("ERROR NAME: " + e.getMessage());