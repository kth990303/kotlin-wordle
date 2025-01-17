package wordle.domain

import io.kotest.matchers.shouldBe
import org.junit.jupiter.api.DisplayName
import org.junit.jupiter.api.Test
import java.time.LocalDate

class WordPickerTest {

    @Test
    @DisplayName("오늘의 단어를 가져온다.")
    fun pickTodayAnswer() {
        val wordPicker = WordPicker(LocalDate.of(2021, 6, 20))

        val todayAnswer = wordPicker.pickTodayAnswer()

        todayAnswer shouldBe Word("rebut")
    }
}
