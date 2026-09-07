```java
public class Alarm {

    public static void main(String[] args) {

        int cpuUsage = 85;
        int threshold = 80;

        System.out.println("Current CPU Usage: " + cpuUsage + "%");

        if (cpuUsage > threshold) {
            System.out.println("🚨 ALARM: CPU usage is above " + threshold + "%");
        } else {
            System.out.println("✅ CPU usage is normal");
        }
    }
}
```
