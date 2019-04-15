package com.fmatusiak.libraryapi.service;

import com.fmatusiak.libraryapi.domain.Reader;
import com.fmatusiak.libraryapi.repository.ReaderRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ReaderService {

    @Autowired
    private ReaderRepository readerRepository;

    public void saveReader(Reader reader) {
        readerRepository.save(reader);
    }

    public void deleteReader(Reader copyBook) {
        readerRepository.delete(copyBook);
    }

    public Reader findReaderById(Long id) {
        return readerRepository.findById(id).orElse(null);
    }

    public List<Reader> findAllReaders() {
        return readerRepository.findAll();
    }
}
