package com.bridgelabz.census.analyser;

import com.dao.IndianStateCode;
import com.exception.CSVBuilderException;

import java.io.Reader;
import java.util.Iterator;
import java.util.List;

public interface IcsvBuilder {
    public <E> Iterator<E> getCSVFileIterator(Reader reader, Class<E> csvClass) throws CSVBuilderException;

    List<IndianStateCode> getCSVFileList(Reader reader, Class<IndianStateCode> indianStateCodeClass);
}