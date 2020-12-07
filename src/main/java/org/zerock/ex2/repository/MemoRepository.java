package org.zerock.ex2.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.zerock.ex2.domain.Memo;

public interface MemoRepository extends JpaRepository<Memo, Long> {
}
