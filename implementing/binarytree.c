#include <stdio.h>
#include <stdlib.h>

// Struktur untuk merepresentasikan node dalam pohon biner
struct Node {
    int data;
    struct Node* left;
    struct Node* right;
};

// Fungsi untuk membuat node baru dalam pohon biner
struct Node* createNode(int data) {
    struct Node* newNode = (struct Node*)malloc(sizeof(struct Node));
    newNode->data = data;
    newNode->left = NULL;
    newNode->right = NULL;
    return newNode;
}

// Fungsi untuk mencetak pohon biner secara PreOrder
void preOrderTraversal(struct Node* root) {
    if (root != NULL) {
        printf("%d ", root->data); // Cetak akar
        preOrderTraversal(root->left); // Rekursif ke anak kiri
        preOrderTraversal(root->right); // Rekursif ke anak kanan
    }
}

// Fungsi untuk mencetak pohon biner secara InOrder
void inOrderTraversal(struct Node* root) {
    if (root != NULL) {
        inOrderTraversal(root->left); // Rekursif ke anak kiri
        printf("%d ", root->data); // Cetak akar
        inOrderTraversal(root->right); // Rekursif ke anak kanan
    }
}

// Fungsi untuk mencetak pohon biner secara PostOrder
void postOrderTraversal(struct Node* root) {
    if (root != NULL) {
        postOrderTraversal(root->left); // Rekursif ke anak kiri
        postOrderTraversal(root->right); // Rekursif ke anak kanan
        printf("%d ", root->data); // Cetak akar
    }
}

int main() {
    struct Node* root = createNode(4);
    root->left = createNode(2);
    root->right = createNode(5);
    root->left->left = createNode(1);
    root->left->right = createNode(3);

    printf("PreOrder traversal: ");
    preOrderTraversal(root);
    printf("\n");

    printf("InOrder traversal: ");
    inOrderTraversal(root);
    printf("\n");

    printf("PostOrder traversal: ");
    postOrderTraversal(root);
    printf("\n");

    return 0;
}
