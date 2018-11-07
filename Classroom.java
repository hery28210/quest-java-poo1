public class Classroom {
    public static void main(String[] args) {
        Wilder jeanclaude = new Wilder("Jean-Claude");
        jeanclaude.setAware(true);
        System.out.println(jeanclaude.whoAmI());

        Wilder Henri = new Wilder("Henri");
        Henri.setAware(false);
        System.out.println(Henri.whoAmI());


    }




}