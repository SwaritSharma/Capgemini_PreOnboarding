package LinkedList.StudentRecordManagement;
import LinkedList.Node;
public class StudentLinkedList
{
    private Node<Student> head;

    public void addAtBeginning(Student student){
        Node<Student> newNode=new Node<>(student);
        newNode.next=head;
        head=newNode;
    }

    public void addAtEnd(Student student){
        Node<Student> newNode=new Node<>(student);
        if(head==null){
            head=newNode;
            head.next=null;
        }
        Node<Student> temp=head;
        while(temp.next!=null){
            temp=temp.next;
        }
        temp.next=newNode;
        newNode.next=null;
    }

    public void display(){
        Node<Student>temp=head;
        while(temp!=null){
            Student s=temp.data;
            System.out.println(
                    "RollNo=" + s.getRollNo() +
                            ", Name=" + s.getName() +
                            ", Age=" + s.getAge() +
                            ", Grade=" + s.getGrade()
            );
            temp=temp.next;
        }
    }

    public Student searchByRollNo(int rollNo){
        Node<Student> temp=head;
        while(temp!=null){
            if(temp.data.rollNo==rollNo) {
                return temp.data;
            }
            temp=temp.next;
        }
        return null;
    }

    public void updateGrade(int rollNo,int newGrade){
        Node<Student> temp=head;
        while(temp!=null){
            if(temp.data.rollNo==rollNo){
                temp.data.grade=newGrade;
            }
            temp=temp.next;
        }
    }

    public void deleteByRollNo(int rollNo){
        Node<Student>temp=head;

        if(head==null){
            return;
        }

        if(head.data.rollNo==rollNo){
            head=head.next;
            return;
        }

        while(temp.next!=null){
            if(temp.next.data.rollNo==rollNo){
                temp.next=temp.next.next;
                return;
            }
            temp=temp.next;
        }
    }
    public int length(){
        Node<Student>temp=head;
        int c=0;
        while(temp!=null){
            c++;
            temp=temp.next;
        }
        return c;
    }
    public void addAtPosition(int pos,Student student){
        Node<Student> newNode=new Node<>(student);
        if(pos<=0){
            return;
        }

        if(pos==1){
            addAtBeginning(student);
            return;
        }

        if(pos > this.length()+1){
            return;
        }

        int i=1;
        Node<Student> temp=head;
        while (temp!=null && i!=pos-1){
            temp=temp.next;
            i++;
        }

        if(temp==null)return;

        Node<Student> join=temp.next;
        temp.next=newNode;
        newNode.next=join;
    }
}
