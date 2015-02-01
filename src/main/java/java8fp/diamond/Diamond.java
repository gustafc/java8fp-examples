package java8fp.diamond;

interface I  {           default String m(){ return "I"; } }
interface IA extends I { default String m(){ return "IA"; } }
interface IB extends I { default String m(){ return "IB"; } }
class CA implements I {  public String m(){ return "CA"; } }

class X extends CA implements IA {} // OK, "CA"
class Y implements IA {}     // OK, "IA"
class Y2 implements I, IA {} // OK, "IA"
//class Z implements IA, IB {} // "Inherits unrelated defaults"
class Z2 implements IA, IB {
    @Override public String m() {
        return IA.super.m();     // OK, "IA"
    }
}