class NotificationSystem {
    // Overloaded method: Broadcast message
    public void sendNotification(String message) {
        System.out.println("Broadcast Alert: " + message);
    }

    // Overloaded method: Email alert
    public void sendNotification(String message, String email) {
        System.out.println("Email sent to " + email + " -> " + message);
    }

    // Overloaded method: SMS alert (uses long to differentiate from String parameters)
    public void sendNotification(String message, long phoneNumber) {
        System.out.println("SMS sent to +" + phoneNumber + " -> " + message);
    }

    public static void main(String[] args) {
        NotificationSystem system = new NotificationSystem();

        system.sendNotification("Server restart in 5 mins.");
        system.sendNotification("Your OTP is 4432", "user@test.com");
        system.sendNotification("Package delivered!", 15550199L);
    }
}
