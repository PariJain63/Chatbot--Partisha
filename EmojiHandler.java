public class EmojiHandler {

    // Method to add an emoji to a string
    public String addEmoji(String message, String emoji) {
        return message + " " + emoji;
    }

    // Method to add a default emoji if none is provided
    public String addDefaultEmoji(String message) {
        return addEmoji(message, "😊"); // Adding default smiley emoji
    }
}
