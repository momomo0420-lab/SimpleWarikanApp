package com.example.simple_warikan_app.ui.components

import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.OutlinedTextField
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp

/**
 * 左側にラベル、右側に単位が付いたテキスト入力フィールドを表示する、コンポーズ可能な関数です。
 * ラベル用の `Text`、ユーザー入力用の `OutlinedTextField`、単位用の別の `Text` で構成され、
 * すべて `Row` 内に水平に配置されます。
 *
 * @param modifier `Row` コンテナに適用する修飾子。
 * @param label 入力フィールドのラベルとして表示されるテキスト。
 * @param unit 入力値の単位として表示されるテキスト（例: "円"、"人")。
 * @param value テキストフィールドに表示される現在の値。
 * @param onValueChange テキストフィールドの値が変更されたときにトリガーされるコールバック。
 */
@Composable
fun LabeledInputField(
    modifier: Modifier = Modifier,
    label: String = "",
    unit: String = "",
    value: String = "",
    onValueChange: (String) -> Unit = {},
) {
    Row(
        modifier = modifier,
        verticalAlignment = Alignment.CenterVertically
    ) {
        Text(label)
        Spacer(Modifier.padding(8.dp))

        OutlinedTextField(
            value = value,
            onValueChange = onValueChange,
            textStyle = TextStyle(textAlign = TextAlign.Right)
        )
        Spacer(Modifier.padding(8.dp))

        Text(unit)
    }
}

@Preview(showBackground = true)
@Composable
fun LabeledInputFieldWithPeopleCountPreview() {
    LabeledInputField(
        label = "人数",
        unit = "人",
        value = "4",
        onValueChange = {},
    )
}

@Preview(showBackground = true)
@Composable
fun LabeledInputFieldWithAmountPreview() {
    LabeledInputField(
        label = "金額",
        unit = "円",
        value = "10000",
        onValueChange = {},
    )
}
