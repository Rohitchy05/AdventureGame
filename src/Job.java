public class Job {
    private boolean merchant;
    private boolean blacksmith;
    private boolean doctor;
    private boolean farmer;
    public Job(boolean isMerchant, boolean isBlacksmith, boolean isDoctor, boolean isFarmer) {
        merchant = isMerchant;
        blacksmith = isBlacksmith;
        doctor = isDoctor;
        farmer = isFarmer;
    }
}
