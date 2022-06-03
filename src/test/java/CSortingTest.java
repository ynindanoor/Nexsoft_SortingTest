import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvFileSource;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTimeout;
import static org.junit.jupiter.api.Assertions.assertArrayEquals;
import java.time.Duration;
import java.util.Arrays;

import org.junit.jupiter.api.DisplayName;

import com.nexsoft.sorting.CSorting;
public class CSortingTest {

	CSorting csorting = new CSorting();
	int num[] = new int[5];

	@ParameterizedTest
	@DisplayName("Bubble Sort Test Sesuai")
	@CsvFileSource(resources = "data.csv", delimiter=',',numLinesToSkip = 1)
	public void test_bubbleSort_dataSesuai(int a, int b, int c, int d, int e) {
		assertTimeout(Duration.ofMillis(500), () -> {
	//arrange - siapin data2 yang dibutuhkan, informasi agar test bisa berjalan
		//assertTimeout(Duration.ofMillis(500), ()->{
		//arrange
	
		int num[] = {a,b,c,d,e};
		int expected[] = {a,b,c,d,e};
		Arrays.sort(expected);
		
		//act
		csorting.bubbleSort(num, num.length);
		csorting.bubbleSort(expected, expected.length);
		
		//assert
		assertArrayEquals(expected, num);
		});
	}
		@ParameterizedTest
		@DisplayName("Bubble Sort Test Tidak Sorting")
		@CsvFileSource(resources = "data.csv", delimiter=',',numLinesToSkip = 1)
		public void test_bubbleSort_dataTidakSorting(int a, int b, int c, int d, int e) {
			assertTimeout(Duration.ofMillis(500), () -> {
		//arrange - siapin data2 yang dibutuhkan, informasi agar test bisa berjalan
			//arrange
		
			int num[] = {a,b,c,d,e};
			int expected[] = {a,b,c,d,e};
			
			//act
			csorting.bubbleSort(num, num.length);
			csorting.bubbleSort(expected, expected.length);
			
			//assert
			assertArrayEquals(expected, num);
			});
		}
			@ParameterizedTest
			@DisplayName("Selection Sort Test Sesuai")
			@CsvFileSource(resources = "data.csv", delimiter=',',numLinesToSkip = 1)
			public void test_selectionSort_dataSesuai(int a, int b, int c, int d, int e) {
				assertTimeout(Duration.ofMillis(500), () -> {
			//arrange - siapin data2 yang dibutuhkan, informasi agar test bisa berjalan
				//assertTimeout(Duration.ofMillis(500), ()->{
				//arrange
			
				int num[] = {a,b,c,d,e};
				int expected[] = {a,b,c,d,e};
				Arrays.sort(expected);
				
				//act
				csorting.selectionSort(num);
				csorting.selectionSort(expected);
				
				//assert
				assertArrayEquals(expected, num);
				});
			}
				@ParameterizedTest
				@DisplayName("Selection Sort Test Tidak Sorting")
				@CsvFileSource(resources = "data.csv", delimiter=',',numLinesToSkip = 1)
				public void test_selectionSort_dataTidakSorting(int a, int b, int c, int d, int e) {
					assertTimeout(Duration.ofMillis(500), () -> {
				//arrange - siapin data2 yang dibutuhkan, informasi agar test bisa berjalan
					//arrange
				
					int num[] = {a,b,c,d,e};
					int expected[] = {a,b,c,d,e};
					
					//act
					csorting.selectionSort(num);
					csorting.selectionSort(expected);
					
					//assert
					assertArrayEquals(expected, num);
					});
				}
				
				@ParameterizedTest
				@DisplayName("Insertion Sort Test Sesuai")
				@CsvFileSource(resources = "data.csv", delimiter=',',numLinesToSkip = 1)
				public void test_insertionSort_dataSesuai(int a, int b, int c, int d, int e) {
					assertTimeout(Duration.ofMillis(500), () -> {
				//arrange - siapin data2 yang dibutuhkan, informasi agar test bisa berjalan
					//assertTimeout(Duration.ofMillis(500), ()->{
					//arrange
				
					int num[] = {a,b,c,d,e};
					int expected[] = {a,b,c,d,e};
					Arrays.sort(expected);
					
					//act
					csorting.insertionSort(num, num.length);
					csorting.insertionSort(expected, expected.length);
					
					//assert
					assertArrayEquals(expected, num);
					});
				}
					@ParameterizedTest
					@DisplayName("Insertion Sort Test Tidak Sorting")
					@CsvFileSource(resources = "data.csv", delimiter=',',numLinesToSkip = 1)
					public void test_insertionSort_dataTidakSorting(int a, int b, int c, int d, int e) {
						assertTimeout(Duration.ofMillis(500), () -> {
					//arrange - siapin data2 yang dibutuhkan, informasi agar test bisa berjalan
						//arrange
					
						int num[] = {a,b,c,d,e};
						int expected[] = {a,b,c,d,e};
						
						//act
						csorting.insertionSort(num, num.length);
						csorting.insertionSort(expected, expected.length);
						
						//assert
						assertArrayEquals(expected, num);
						});
					}
	}