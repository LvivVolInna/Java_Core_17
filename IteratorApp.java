package hw17;

public class IteratorApp {

	public static void main(String[] args) {
		Integer [] arr = {1, 43, -2, 34, 9, 17, -82, 1, 6, 55, 12, 45, 88, -14, -32, 8, 14};
		
		Collection collection = new Collection(arr);
		System.out.println("Виводимо усі значення масиву");
		for (Integer integer : arr) {
			System.out.println(integer);
		}
		System.out.println();
		
		System.out.println("Виводимо значення масиву від першого до останнього, замінюючи непарні елементи на нуль");
		Iterator iteratorForward = collection.createForwardIterator();
		
		while (iteratorForward.hesNext()) {
			Integer next = iteratorForward.next();
				if(next % 2 != 0) {
					System.out.println(0);
				}else 
			System.out.println(next);		
		}
		System.out.println();
		
		System.out.println("Виводимо значення масиву від останнього до першого через одну цифру");
		Iterator iteratorBackward = collection.createBackwardIterator();
		
		while( iteratorBackward.hesNext()) {
			System.out.println(iteratorBackward.next());
		}
		System.out.println();
		
		System.out.println("Виводимо на консоль кожен третій непарний елемент масиву від останньогодо першого");
		Iterator iteratorAnonimous = collection.createAnonimousIterator();
		int i = 1;
		while (iteratorAnonimous.hesNext()) {
			Integer nextA = iteratorAnonimous.next();
			if (i % 3 == 0) {
				if (nextA % 2 != 0) {
					System.out.println(nextA);
				} 
			}
			i++;
		}
		System.out.println();
		
		System.out.println("Виводимо на консоль кожен п'ятий парний елемент масиву від першого до останнього, зменшений на 100");
		Iterator iteratorLocal = collection.createLocalIterator();
		int j = 1;
		while (iteratorLocal.hesNext()) {
			Integer nextL = iteratorLocal.next();
			if (j % 5 == 0) {
				if (nextL % 2 == 0) {
					System.out.println(nextL-100);
				} 
			}
			j++;
		}
		System.out.println();
		
		System.out.println("Виводимо на консоль кожен другий елемент масиву, але у випадку, якщо він парний, пертворюємо його на непарний");
		Iterator iteratorStatic = collection.createStaticIterator();
		int k = 1;
		while (iteratorStatic.hesNext()) {
			Integer nextS = iteratorStatic.next();
			if (k % 2 == 0) {
				
				if (nextS % 2 == 0) {
					System.out.println(nextS+1);
				}else
					System.out.println(nextS);
			}
			k++;
		}
		
	}

}
