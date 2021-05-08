package hw17;

public interface Iterator {
	public boolean hesNext();
	public Integer next();
}
	class Collection{
		private static Integer [] array;
		
		Collection (Integer [] array){
			Collection.array = array;
		}
		
		
		public class ForwardIterator implements Iterator{

			private int i = 0;
			
			@Override
			public boolean hesNext() {
				return i< array.length;
			}

			@Override
			public Integer next() {
				return array[i++];
			}
			
		}
		
		
		public ForwardIterator createForwardIterator() {
			return new ForwardIterator();
		}
		
		public class BackwardIterator implements Iterator{
            
			private int i = array.length-1;
			
			@Override
			public boolean hesNext() {
				return i>=0;
			}

			@Override
			public Integer next() {
				i=i-2;
				return array[i+2];
			}
			
		}
	
		public BackwardIterator createBackwardIterator() {
			return new BackwardIterator();
		}
		
		public Iterator createAnonimousIterator() {
			return new Iterator() {

				private int i = array.length-1;
				
				@Override
				public boolean hesNext() {
					return i>=0;
				}

				@Override
				public Integer next() {
					
					return array[i--];
				}
				
			};
		}
		
		public Iterator createLocalIterator() {
			class LocalIterator implements Iterator{

				private int i = 0;
				
				@Override
				public boolean hesNext() {
					return i< array.length;
				}

				@Override
				public Integer next() {
					return array[i++];
				}
				
			}
			return new LocalIterator();
		}

		
		private static class StaticIterator implements Iterator{

			private int i = 0;
			
			@Override
			public boolean hesNext() {
				return i< array.length;
			}

			@Override
			public Integer next() {
				return array[i++];
			}
			
		}
		
		public static StaticIterator createStaticIterator() {
			return new StaticIterator();
		}
		
}
