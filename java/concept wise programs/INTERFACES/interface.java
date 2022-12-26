/*
limk :::    https://youtu.be/FRCSxRUngyE
 interface;
    say for ex u want switch on fan then see that switch will act as an interface b/w u and the fan 
    so interface is a device(or)thing(concrete) which will be in b/w two things

    see another best example is 
        1)consider u went to the hotel and took menu card there and absolutely u dont need all of the items in the menu.so u will say to the waiter which items u need exactly.
        2)when u said what are ur required items to the waiter he will write all those thing and goes to chef and he cooks those and returns them to the customer

        3)see look here u need food which will be cooked by chef u say to waiter the items those will be wriiten in order by waiter and that is given to chef and he gets ready all those.
            see here the list written by waiter acts as interface in b/w u and the chef(from whom u gets food)

        4)similarly in coders perspective interface is like list of rules(or to be done tasks) 

        example of coding w.r.t interface:
        see let us go through example see for example u were asked by a client to build a site or an application for hotel manage ment
        
        5)see as application need to be developed then u need to have which is called as SRS=software requirement specification(contract b/w client and company in which what and all to be included in application are included(bcz u cant implement everything infront of client)) see it will be like below

        requiremnts
        {
            booking();
            reservation();
            maintainence();
            erp();
            party();
            ....
            ...
            ...
            ..
            and so on methods will be there so we include all these methods in interface

            see whatever methods have been specified those only to be submitted and those should not be in such a way that can be editabble by client say for ex app for 100 members means for 100 members only should not be in such a way that can be increased by client(to get money)

            so it means every thing should not be changed means 1.everything or every software requrimwnts provided should be final
        }

        see here w.r.t any applocation development we will be listing what all need to be there ot to be included.so will be having set of rules(rules in the sense these all methods to be implemented are rules).see once listing of tasks  to be done is finished next task is to implement all of these rules .so here the collection of all these rules(reservation,maintainance,booking,(list))is interface

       and  just by defining class we wont be having implemented class so what we have to do is after framing rules(interface) there should be a class which will be implementing the rules specified in interfaces


       final words:
            see interface is like set of rules(tasks) or blueprint of rules and why we use only interface is see when creating app for client it should not be changeble by him so methods should be final and see it should show like if we submit the application without completion of one particular thing it should show error like not implements soo only w.r.t interfaces this is possibe so we use interfaces
            and interface will be convinent for implenter guy to see what all he shoud do


programatic terms on interface:
            1)interface is an abstract kind of thing by default
            2)the methods or variable declared in interface are final(if implemented see as method mostly will be abstract methods so can implement.for ex see dafault method used in interface cant be modified in implemented class bcz everything in interface are final),public by default eventhough u does specific acces specifier public is assingned not default as in classes

            3)it can contain abstract methods,default method,static method
            
            4)we cant extend interface directly  by extends(bcz extends can extends of type classes not interfaces) for sure it need to be implemented in any class by implements from there we can extend it to any other class where we extends a type class not inteterface
 */