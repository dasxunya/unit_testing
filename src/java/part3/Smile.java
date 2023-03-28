package part3;

public class Smile {
    private final String speed;
    private final String reason;
    private Boolean isForEffect;

    public Smile(Boolean ifForEffect, String speed, String reason) {
        this.isForEffect = ifForEffect;

        if (reason != null) {
            if (!ifForEffect) {
                this.speed = "очень медленно";
                this.reason = "не мог вспомнить правильную последовательность движения мышц";
            } else {
                this.speed = speed;
                this.reason = reason;
            }
        } else {
            this.speed = "";
            this.reason = "беспричинно";
        }

    }

    public String getSpeed() {
        if (!isForEffect) {
            return "улыбнулся " + this.speed;
        } else {
            return "стал серьезен " + this.speed;
        }
    }

    public Boolean getIsForEffect() {
        return this.isForEffect;
    }

    public void setIsForEffect(boolean isForEffect){
        this.isForEffect = isForEffect;
    }

    public String getReason() {
        return this.reason;
    }

    @Override
    public String toString() {
        if (!this.isForEffect) {
            return "Он сделал так не ради эффекта";
        } else {
            return "Он сделал так ради эффекта";
        }
    }
}