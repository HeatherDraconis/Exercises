package org.challenges;

import java.io.IOException;

public class Test {
    enum RedPandaType { Friendly, Unfriendly }

    Integer fred=0;
    static Integer george=0;

    public Test() {
        super();
        System.out.println("Created test");
        for(RedPandaType v:RedPandaType.values())
        {
            System.out.println(v);
        }
    }

    public static void main(String[] args) throws IOException {
        Test t = new Test();
        for(int i=0;i<10;i++) {
            Answer a = t.foo(3);
            a.b();
        }

    }

    public RedPandaType hello(){
        return RedPandaType.Friendly;
    }

    @Deprecated
    protected Answer foo(int i) {
        fred++;
        george+=1000001;
        george-=1000000;
        System.out.println(System.identityHashCode(this));
        System.out.println("fred="+fred+","+System.identityHashCode(fred));
        System.out.println("george="+george+","+System.identityHashCode(george));
        return new Answer(fred,george);
    }


    interface flier {
        void fly();
    }
}

record Answer(Integer a, Integer b) {
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Answer answer)) return false;

        return a.equals(answer.a) &&
                b.equals(answer.b);
    }
}



class Test2 extends Test
{
    protected Answer foo(int i)
    {
        return null;
    }
}