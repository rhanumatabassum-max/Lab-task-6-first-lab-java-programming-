class TextFormatter {

    // Converts text to uppercase
    public String formatText(String text) {
        return text.toUpperCase();
    }

    // Repeats string specified number of times separated by space
    public String formatText(String text, int times) {
        return (text + " ").repeat(times).trim();
    }

    // Attaches a prefix block to text
    public String formatText(String text, String prefix) {
        return "[" + prefix + "] " + text;
    }

    public static void main(String[] args) {
        TextFormatter formatter = new TextFormatter();

        System.out.println(formatter.formatText("HELLO"));
        System.out.println(formatter.formatText("Echo", 3));
        System.out.println(formatter.formatText("System updated", "INFO"));
    }
}
