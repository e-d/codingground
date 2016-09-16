public class Chair {
    
    private int comfortLevel;
    
    public int getComfortLevel() {
        return comfortLevel;
    }
    
    public void setComfortLevel(int comfortLevel) {
        this.comfortLevel = comfortLevel;
    }
    
    @Override
    public String toString() {
        return "I'm a chair with comfortLevel: " + comfortLevel;
    }
}