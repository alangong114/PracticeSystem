package app;
import java.util.concurrent.LinkedBlockingQueue; //LinkedBlockingDeque
import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.BlockingQueue;
 public class BlockingQueueTest{
      public static void main(String[] args){
    
      }
  
  /**
  * 阻塞栈
  * 
  * @author
  * 
  */

      public static void ArrayBlockingQueueTest(){
        BlockingQueue queue = new ArrayBlockingQueue(20);
        for (int i = 0; i < 30; i++) {
            // 将指定元素添加到此队列中，如果没有可用空间，将一直等待（如果有必要）。
            queue.put(i);
            System.out.println("向阻塞队列中添加了元素:" + i);
        }
        System.out.println("程序到此运行结束，即将退出----");
  
      }
      /**
       * 阻塞队列
       * 
       * 
      */
      public static void LinkedBlockingQueueTest(){
          BlockingDeque bDeque = new LinkedBlockingDeque(20);
        for (int i = 0; i < 30; i++) {
            // 将指定元素添加到此阻塞栈中，如果没有可用空间，将一直等待（如果有必要）。
            bDeque.putFirst(i);
            System.out.println("向阻塞栈中添加了元素:" + i);
        }
        System.out.println("程序到此运行结束，即将退出----");

      }
  }
