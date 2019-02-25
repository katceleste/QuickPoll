package com.apress.repository;

import com.apress.domain.Vote;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

//CrudRepository <T, ID> -> T = domain type repo manages; ID = the type of the ID of the entity repo manages
public interface VoteRepository extends CrudRepository <Vote, Long> {

    // At runtime, Spring Data JPA replaces the ?1 placeholder with the passed-in pollId parameter value.
    @Query(value="select v.* from Option o, Vote v where o.POLL_ID = ?1 and " +
            "v.OPTION_ID = o.OPTION_ID", nativeQuery = true)
    public Iterable<Vote> findByPoll(Long pollId);

}
