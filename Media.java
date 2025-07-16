public class Media {

    // Lớp trừu tượng Item
    public static abstract class Item {
        public String name;
        private String description;
        protected String id;
        float price;

        public Item(String name, String description, String id, float price) {
            this.name = name;
            this.description = description;
            this.id = id;
            this.price = price;
        }

        public String getDescription() {
            return description;
        }

        public void setDescription(String description) {
            this.description = description;
        }

        public abstract void showInfo();
    }

    // Lớp MP3
    public static class MP3 extends Item {
        private int duration;

        public MP3(String name, String description, String id, float price, int duration) {
            super(name, description, id, price);
            this.duration = duration;
        }

        @Override
        public void showInfo() {
            System.out.println("Thông tin MP3:");
            System.out.println("Name: " + name);
            System.out.println("Description: " + getDescription());
            System.out.println("ID: " + id);
            System.out.println("Price: $" + price);
            System.out.println("Duration: " + duration + " minutes");
        }
    }

    // Lớp Book
    public static class Book extends Item {
        private String author;
        private int numberOfPages;
        private String genre;

        public Book(String name, String description, String id, float price, String author, int numberOfPages, String genre) {
            super(name, description, id, price);
            this.author = author;
            this.numberOfPages = numberOfPages;
            this.genre = genre;
        }

        @Override
        public void showInfo() {
            System.out.println("Thông tin Book:");
            System.out.println("Name: " + name);
            System.out.println("Description: " + getDescription());
            System.out.println("ID: " + id);
            System.out.println("Price: $" + price);
            System.out.println("Author: " + author);
            System.out.println("Pages: " + numberOfPages);
            System.out.println("Genre: " + genre);
        }
    }

    // Main method
    public static void main(String[] args) {
        MP3 mp3 = new MP3("Chill", "Relax", "0-11", 0.99f, 60);
        Book book = new Book("David", "Storm", "Bk", 19.9f, "John", 350, "Pro");

        mp3.showInfo();
        System.out.println("--------------------");
        book.showInfo();
    }
}
