idempotency: The property of idempotency means that an operation does not 
cause additional side effects if it is called more than once with the same input parameters.
Idempotent operations will return the same result when they are called multiple times with the same parameters.

What is idempotent in REST API?
if we make multiple identical requests and receive the same response every time, the APIs are generally called idempotent. Some API consumers knowingly or unknowingly make the same request twice or thrice. The APIs have to understand this and reply with the same response.

Which of the HTTP methods is idempotent?
The following HTTP methods are idempotent: 
GET, HEAD, OPTIONS, TRACE, PUT and DELETE. 
All safe HTTP methods are idempotent but PUT and DELETE are idempotent but not safe.


Why is PUT idempotent?
PUT is an idempotent method because it updates a record. If PUT/payment endpoint is called with an identical request, it will result in no state change other than the first request.

Why is POST not idempotent?
Post method always results in a server state change. If the POST method was idempotent, everything sent and accepted to or from the web server would already have to exist on the server in some form to respond with the same codes and value response. For that reason, POST cannot be idempotent.

FAQs
Q. What is the difference between stateful and stateless?
A. The major difference between stateful and stateless is whether or not 
they store data regarding their sessions, and how they respond to requests. 
Stateful services keep track of sessions or transactions and respond to the same inputs in different ways depending on their history. 
Clients maintain sessions for stateless services, which are focused on activities that manipulate resources rather than the state.

Q. Is stateless better than stateful?
A. In most cases, stateless is a better option when compared with stateful. 
However, in the end, it all comes down to your requirements. 
If you only require information in a transient, rapid, and temporary manner, 
stateless is the way to go. Stateful, on the other hand, might be the way to go if your app requires more memory of what happens from one session to the next.

Q. Is HTTP stateful or stateless?
A. HTTP is stateless because it doesn’t keep track of any state information. In HTTP, each order or request is carried out in its own right, with no awareness of the demands that came before it.

Q. Is REST API stateless or stateful?
A. REST APIs are stateless because, rather than relying on the server remembering previous requests, REST applications require each request to contain all of the information
necessary for the server to understand it. Storing session state 
on the server violates the REST architecture’s stateless requirement. As a result, the client must handle the complete session state. 


## Generics
Generics enable the use of stronger type-checking, the elimination of casts, and the ability to develop generic algorithms.
Without generics, many of the features that we use in Java today would not be possible.

Use generic types to maximize code reuse, type safety, and performance. The most common use of generics is to create collection classes.

Example :

Consider the following scenario: You wish to develop a container that will be used to pass an object around within your application. 
However, the object type is not always going to be the same. Therefore, you need to develop a container that has the ability to store objects of various types.

Given this scenario, the most obvious way to achieve the goal would be to develop a container that has the ability to store and retrieve the Object type itself, and then cast that object when using it with various types. The class in Listing 1 demonstrates development of such a container.

#Comparable and Comparator
To summarize, if sorting of objects needs to be based on natural order then use Comparable whereas if you sorting needs to be done on attributes of different objects, then use Comparator in Java.


Creates a new thread and the run() method is executed on the newly created thread.
No new thread is created and the run() method is executed on the calling thread itself.
Can’t be invoked more than one time otherwise throws java.lang.IllegalStateException	
Multiple invocation is possible
Defined in java.lang.Thread class.	
Defined in java.lang.Runnable interface and must be overridden in the implementing class.



Mutual Exclusion
Hold and Wait
No preemption
Circular wait
