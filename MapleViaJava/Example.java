/*
External libraries: <mapledir>/java/externalcall.jar, <ampledir>//java/Maple.jar
Env variables: MAPLE=<mapledir>, LD_LIBRARY_PATH=<mapledir>/bin.SYS (SYS={win, X86_64_LINUX, itp.)
If (# A fatal error has been detected by the Java Runtime Environment:
#
#  SIGSEGV (0xb) at pc=0x00007fe8f991c641, pid=4027, tid=0x00007fe8dda00700) then: zmień rozmiar stosu Javy,
Run->Edit Configurations->VM Option "-Xms2g -Xmx6g" (przykladowo)
 */
public class Example {
    public static void main(String[] args) {
        MapleTerminal m = MapleTerminal.getInstance();
        MapleTerminal n = MapleTerminal.getInstance();
        System.out.println(m.evaluate("a:=2;"));
        System.out.println(m.evaluate("b:=3;"));
        System.out.println(n.evaluate("c:=a+b;"));
    }
}
