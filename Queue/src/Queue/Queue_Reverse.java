package Queue;

public class Queue_Reverse {

	public static void main(String[] args) throws Exception {
		Queue q = new Queue();
		q.Enqueue(10);
		q.Enqueue(20);
		q.Enqueue(30);
		q.Enqueue(50);
		q.Enqueue(60);
		q.Display();
		System.out.println(".........");
		Reverse(q);
		q.Display(); 

	}

	public static void Reverse(Queue q) throws Exception {
		if(q.isEmpty()) {
			return;
		}
    int i = q.Dequeue();
    Reverse(q);
    q.Enqueue(i);
	}
}
