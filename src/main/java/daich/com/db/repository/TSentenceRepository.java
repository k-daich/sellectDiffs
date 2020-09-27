package daich.com.db.repository;

import org.springframework.stereotype.Repository;

import daich.com.db.entity.T_Sentence;

@Repository
public interface TSentenceRepository {

    T_Sentence findBySentence_id(String sentence_id);
}