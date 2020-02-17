package threadscheduler;

import io.reactivex.Observable;
import io.reactivex.schedulers.Schedulers;

import java.util.Arrays;
import java.util.List;

public class ThreadScheduler {

  public static void main(String[] argv) {

    System.out.println(Thread.currentThread().getName());

    String[] n = {"alpha","baker","charlie","delta","echo","foxtrot"};

    // sleep is required to keep application alive
    // while work is being done off of the main thread
    try {
      Thread.sleep(5000);
    } catch (InterruptedException e) {
      e.printStackTrace();
    }

    System.out.println(Thread.currentThread().getName());

  }


}
