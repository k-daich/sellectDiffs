package daich.com.procedure;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import daich.com.poi.writer.ExcelWriter;
import daich.com.db.entity.T_Sentence;
import daich.com.db.repository.TSentenceRepository;

@Component
public class SellectDiffProcedure {

    @PersistenceContext
    EntityManager em;

    @Autowired
    private TSentenceRepository tSentenceRepo;

    public void execute(String sentence_id) {

        // TSentenceテーブルをSELECT
        T_Sentence tSentence = tSentenceRepo.findBySentence_id(sentence_id);

        ExcelWriter eWriter = new ExcelWriter("TSentence");

    }

}