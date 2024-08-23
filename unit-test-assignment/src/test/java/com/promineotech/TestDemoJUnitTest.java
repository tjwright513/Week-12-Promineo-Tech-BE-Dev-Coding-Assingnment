package com.promineotech;

import static org.assertj.core.api.Assertions.assertThat;
//import static org.assertj.core.api.Assertions.assertThatThrownBy;
import static org.junit.jupiter.params.provider.Arguments.arguments;
import static org.mockito.Mockito.doReturn;
import static org.mockito.Mockito.spy;

import java.util.stream.Stream;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

class TestDemoJUnitTest {

private TestDemo testDemo;	
	
	@BeforeEach
	void setUp() throws Exception {
		testDemo = new TestDemo();
	}

	@Test
	private void assertThatTwoPositiveNumbersAreAddedCorrectly1() {
		assertThat(testDemo.addPositive(3,6)).isEqualTo(9);
		assertThat(testDemo.addPositive(53,106)).isEqualTo(159);
	}
	
	@ParameterizedTest
	@MethodSource("com.promineotech.TestDemoJUnitTest#argumentsForAddPositive")
	void assertThatTwoPositiveNumbersAreAddedCorrectly() {
		int a = 53; 
		int b = 106;
		int expected = 159;
		boolean expectException = false;
		
		if (!expectException){
			assertThat(testDemo.addPositive(a,b)).isEqualTo(expected);
		//assertThatThrownBy(() -> 
        //testDemo.addPositive(a, b))
        //.isInstanceOf(IllegalArgumentException.class);
		}
		
	
	}
	
	static Stream<Arguments> argumentsForAddPositive() {
		return Stream.of(
				arguments(3,6,9,false),
				arguments(53,106,159,false)
				);

}

	@Test
	private void assertThatNumberSquaredIsCorrect() {
		TestDemo mockDemo = spy(testDemo);
		doReturn(5).when(mockDemo);
		TestDemo.getRandomInt();
		int fiveSquared = TestDemo.randomNumberSquared();
		assertThat(fiveSquared).isEqualTo(25);
	}


	

	}
