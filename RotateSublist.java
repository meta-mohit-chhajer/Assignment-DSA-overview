
public class RotateSublist {
	 public static class ListNode{
		int data;
		ListNode next;
		public ListNode(){}
		public ListNode(int data)
		{
			this.data=data;
			this.next=null;
		}
	}
	
	/*
	 * Used to check, if there is any loop inside linked list
	 * @return true if loop present else false
	 */
	public static boolean detectLoop(){
		ListNode head=null;
		List<ListNode> lm=new ArrayList<>();
		while(head!=null){
			if(lm.contains(head))
				return true;
			lm.add(head);
			head=head.next;
	 }
	return false;
}
	
	/*
	* Funtion to perform Rotation of Sublist
	* @param l: left index from where sublist should be started
	* @param r: right index to the end of sublist
	* @param k as how many places a node to be shifted
	*/
	public static void rotate(ListNode A,int l,int r,int k){
		int size=r-l+1;
		if(k>size){
			k=k%size;
		}
		
		if(k==0||k==size){
			ListNode head=A;
			while(head!=null){
				System.out.print(head.data);
				head=head.next;
			}
			return;
		}
		ListNode link=null;
		if(l==1){
			link=A;
		}
		ListNode current=A;
		int cnt=0;
		ListNode end=null;
		ListNode pre=null;
		while(current!=null){
			cnt++;
			if(cnt==l-1){
				pre=current;
				link=current.next;
			}
			if(cnt==r-k){
				if(l==1){
					end=current;
					A=current.next;
				}
				else{
					end=current;
					pre.next=current.next;
				}
				
			}
			
			if(cnt==r)
			{
				ListNode D=current.next;
				current.next=link;
				end.next=D;
				ListNode head=A;
				while(head!=null){
					System.out.print(head.data+" ");
					head=head.next;
				}
				return;
			}
			current=current.next;
		}
	}
	
	/*
	 * Funtion to Push Elements in LinkedList
	 * @param val :value to be entered
	 */
	public static ListNode push(ListNode head,int val)
	{
		ListNode new_node=new ListNode();
		new_node.data=val;
		new_node.next=(head);
		(head)=new_node;
		return head;
	}
	
	public static void main(String...arg)
	{
		ListNode head=null;
		head=push(head,7);
		head=push(head,6);
		head=push(head,5);
		head=push(head,4);
		head=push(head,3);
		head=push(head,2);
		ListNode tmp=head;
		while(tmp!=null)
		{
			System.out.print(tmp.data+" ");
			tmp=tmp.next;
		}
		System.out.println();
		int l=2,r=5,k=2;
		rotate(head, l, r, k);
		System.out.println("List Inside List "+detectLoop());
	}
}
