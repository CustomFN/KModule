package com.z.kmodule.mockito.demo02;

import com.google.common.collect.Lists;
import org.junit.Before;
import org.junit.Test;
import org.mockito.InOrder;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.MockitoAnnotations;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

public class BaseTest {


    @Test
    public void test01() {
        List mockList = Mockito.mock(List.class);

        mockList.add("one");
        mockList.clear();

        Mockito.verify(mockList).add("one");
        Mockito.verify(mockList).clear();
    }

    @Test
    public void test02() {
        LinkedList mockList = Mockito.mock(LinkedList.class);

        Mockito.when(mockList.get(0)).thenReturn("first");
        Mockito.when(mockList.get(1)).thenReturn(new RuntimeException());

        System.out.println(mockList.get(0));
        System.out.println(mockList.get(1));
        System.out.println(mockList.get(999));

        Mockito.verify(mockList).get(0);
    }

    @Test
    public void test03() {
        LinkedList mockList = Mockito.mock(LinkedList.class);

//        Mockito.when(mockList.addAll(Mockito.argThat(new ListOfTwoElements()))).thenReturn(true);
//        mockList.addAll(Arrays.asList("one", "two"));
//        Mockito.verify(mockList).addAll(Mockito.argThat(new ListOfTwoElements()));
//        Mockito.verify(mockList).addAll(Mockito.argThat(list -> list.size() == 2));


//        Mockito.when(mockList.get(Mockito.anyInt())).thenReturn("element");
//        mockList.get(Mockito.argThat(new GuessArgumentMatcher()));
//        Mockito.when(mockList.get(Mockito.argThat(new GuessArgumentMatcher()))).thenReturn("element");
        Mockito.when(mockList.get(Mockito.intThat(new GuessArgumentMatcher()))).thenReturn("element");

        System.out.println(mockList.get(1));
        System.out.println(mockList.get(2));
        System.out.println(mockList.get(3));
        System.out.println(mockList.get(4));

//        Mockito.verify(mockList).get(Mockito.argThat(index -> index == 2));
    }

    @Test
    public void test04() {
        List mockList = Mockito.mock(List.class);

        mockList.add("once");
        mockList.add("twice");
        mockList.add("twice");
        mockList.add("three time");
        mockList.add("three time");
        mockList.add("three time");

        Mockito.verify(mockList).add("once");
        Mockito.verify(mockList, Mockito.times(1)).add("once");
        Mockito.verify(mockList, Mockito.times(2)).add("twice");
        Mockito.verify(mockList, Mockito.times(3)).add("three time");
        Mockito.verify(mockList, Mockito.never()).add("never happened");
        Mockito.verify(mockList, Mockito.atLeastOnce()).add("once");
        Mockito.verify(mockList, Mockito.atLeast(2)).add("once");
        Mockito.verify(mockList, Mockito.atMost(2)).add("once");
        Mockito.verify(mockList, Mockito.atMost(2)).add("three time");
    }

    @Test
    public void test05() {
        List mockList = Mockito.mock(List.class);

        Mockito.doThrow(new RuntimeException()).when(mockList).clear();
        mockList.clear();
    }

    @Test
    public void test06() {
        List singleMock = Mockito.mock(List.class);

        singleMock.add("was added first");
        singleMock.add("was added second");

        InOrder inOrder = Mockito.inOrder(singleMock);

        inOrder.verify(singleMock).add("was added first");
        inOrder.verify(singleMock).add("was added second");

        List firstMock = Mockito.mock(List.class);
        List secondMock = Mockito.mock(List.class);

        firstMock.add("was added first");
        secondMock.add("was added second");

        InOrder inOrderr = Mockito.inOrder(firstMock, secondMock);

//        inOrderr.verify(firstMock).add("was added first");
        inOrderr.verify(secondMock).add("was added second");
        inOrderr.verify(firstMock).add("was added first");
    }

    @Test
    public void test07() {
        List mockOne = Mockito.mock(List.class);
        List mockTwo = Mockito.mock(List.class);
        List mockThree = Mockito.mock(List.class);

        mockOne.add("one");
        Mockito.verify(mockOne).add("one");
        Mockito.verify(mockOne, Mockito.never()).add("two");
        Mockito.verifyZeroInteractions(mockTwo, mockThree);
    }

    @Mock
    private UserProvider userProvider;
    @Mock
    private ArticleDatabase articleDatabase;
    @Mock
    private ArticleCalculator articleCalculator;

    @Before
    public void before() {
        MockitoAnnotations.initMocks(this);
    }

    @Test
    public void test08() {
        List mockList = Mockito.mock(List.class);
        Mockito.when(mockList.get(0)).thenReturn(1).thenReturn(2);

        System.out.println(mockList.get(0));
        System.out.println(mockList.get(0));
        System.out.println(mockList.get(0));
        System.out.println(mockList.get(0));
    }

    @Test
    public void test09() {
        List list = Lists.newArrayList();
        List spyList = Mockito.spy(list);

        Mockito.when(spyList.size()).thenReturn(100);
        spyList.add("one");
        spyList.add("two");

        System.out.println(spyList.get(0));
        System.out.println(spyList.size());

        Mockito.verify(spyList).add("one");
        Mockito.verify(spyList).add("tw");
    }
}
