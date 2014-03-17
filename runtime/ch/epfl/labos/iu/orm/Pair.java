package ch.epfl.labos.iu.orm;

import java.util.Collection;
import java.util.Vector;


public class Pair<T, U>
{
   final T one;
   final U two;
   
   public T getOne()
   {
      return one;
   }
   
   public U getTwo()
   {
      return two;
   }
   
   public Pair(T one, U two)
   {
      this.one = one;
      this.two = two;
   }
   
   public boolean equals(Object obj)
   {
      if ( this == obj) return true;
      
      if (! (obj instanceof Pair)) return false;
      
      Pair<?,?> pair = (Pair<?,?>)obj;
      return this.one.equals(pair.one)
         && this.two.equals(pair.two);
   }
   
   public int hashCode()
   {
      return one.hashCode() + two.hashCode();
   }
   
   public static <V, W> Collection<Pair<V, W>> PairCollection(V one, Collection<W> twoList)
   {
      Vector<Pair<V, W>> combined = new Vector<Pair<V, W>>(twoList.size());
      for (W two: twoList)
         combined.add(new Pair<V, W>(one, two));
      return combined;
   }
}
