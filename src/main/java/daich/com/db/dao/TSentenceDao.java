package daich.com.db.dao;

import javax.persistence.Query;

import org.springframework.stereotype.Component;

import daich.com.db.entity.T_Sentence;
import daich.com.db.dao.base.BaseDao;

@Component
public class TSentenceDao extends BaseDao {

    /**
     * return tableName
     * 
     * @return tableName
     */
    @Override
    protected String getTableName() {
        return "t_sentence";
    }

    /**
     * sentence_idを条件に検索する。 検索結果が1件以外であれば例外を投げる。
     * 
     * @param id
     * @return
     */
    public T_Sentence getById(final String sentence_id) {
        Query query = em.createQuery("from t_sentence where sentence_id = :sentence_id");
        query.setParameter("sentence_id", sentence_id);
        T_Sentence result = (T_Sentence)query.getSingleResult();
        em.close();
        return result;
    }

    /**
     * execute Insert
     * @param entity
     */
    public void create(T_Sentence entity) {
        em.persist(entity);
        em.flush();
        em.close();
    }
}