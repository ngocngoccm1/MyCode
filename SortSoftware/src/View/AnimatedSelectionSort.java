package View;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Arrays;

public class AnimatedSelectionSort extends JFrame {

    private int[] array;
    private JButton startButton;

    public AnimatedSelectionSort() {
        setTitle("Animated Selection Sort");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        array = generateRandomArray(10);

        JPanel panel = new JPanel() {
            @Override
            protected void paintComponent(Graphics g) {
                super.paintComponent(g);
                drawArray(g);
            }
        };

        startButton = new JButton("Bắt đầu");
        startButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                startSorting();
            }
        });

        JPanel controlPanel = new JPanel();
        controlPanel.add(startButton);

        getContentPane().setLayout(new BorderLayout());
        getContentPane().add(panel, BorderLayout.CENTER);
        getContentPane().add(controlPanel, BorderLayout.SOUTH);

        setSize(400, 300);
        setVisible(true);
    }

    private void drawArray(Graphics g) {
        int barWidth = getWidth() / array.length;
        int maxHeight = getHeight();

        for (int i = 0; i < array.length; i++) {
            int barHeight = (int) (((double) array[i] / Arrays.stream(array).max().getAsInt()) * maxHeight);
            Color color = Color.getHSBColor((float) i / array.length, 1, 1);
            g.setColor(color);
            g.fillRect(i * barWidth, maxHeight - barHeight, barWidth, barHeight);
        }
    }

    private int[] generateRandomArray(int size) {
        int[] arr = new int[size];
        for (int i = 0; i < size; i++) {
            arr[i] = (int) (Math.random() * 100);
        }
        return arr;
    }

    private void selectionSort(int[] arr) {
        int n = arr.length;
        for (int i = 0; i < n - 1; i++) {
            int minIndex = i;
            for (int j = i + 1; j < n; j++) {
                if (arr[j] < arr[minIndex]) {
                    minIndex = j;
                }
            }
            int temp = arr[minIndex];
            arr[minIndex] = arr[i];
            arr[i] = temp;

            try {
                Thread.sleep(500);  // Delay for visualization
            } catch (InterruptedException e) {
                e.printStackTrace();
            }

            repaint();  // Repaint the panel after each step
        }
    }

    private void startSorting() {
        startButton.setEnabled(false);  // Disable the button during sorting
        selectionSort(array);
        startButton.setEnabled(true);   // Enable the button after sorting is done
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(AnimatedSelectionSort::new);
    }
}
