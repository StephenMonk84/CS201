import java.time.*;
public class TimeExample {
 private int hour;
 private int minute;
 private int second;
 private LocalDateTime time;
 public TimeExample(LocalDateTime time) {
  this.time = time;
 }
 public int getHour() {
  return time.getHour();
 }
 public int getMinute() {
  return time.getMinute();
 }
 public int getSecond() {
  return time.getSecond();
 }
 public static void main(String[] args) {
  TimeExample time_logged = new TimeExample(LocalDateTime.now());
  int this_hour = time_logged.getHour();
  System.out.println(this_hour);
 }
}